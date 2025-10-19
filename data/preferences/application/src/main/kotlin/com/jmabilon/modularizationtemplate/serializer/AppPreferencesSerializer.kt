package com.jmabilon.modularizationtemplate.serializer

import androidx.datastore.core.Serializer
import com.jmabilon.modularizationtemplate.model.AppPreferences
import kotlinx.serialization.json.Json
import java.io.InputStream
import java.io.OutputStream

/**
 * A serializer implementation for `AppPreferences` used with Jetpack DataStore.
 * This class handles the conversion of `AppPreferences` objects to and from JSON format.
 *
 * **⚠️ WARNING:** This serializer stores data as plain JSON and is **not secure**.
 * Do **not** store sensitive information (like tokens, passwords, or personal data) using this serializer.
 * For sensitive data, implement a custom encryption system (e.g., using Android Keystore + AES/GCM)
 * to ensure that the data is encrypted at rest.
 */
class AppPreferencesSerializer : Serializer<AppPreferences> {

    override val defaultValue: AppPreferences = AppPreferences()

    override suspend fun readFrom(input: InputStream): AppPreferences {
        return try {
            Json.Default.decodeFromString(
                deserializer = AppPreferences.serializer(),
                string = input.readBytes().decodeToString()
            )
        } catch (e: Exception) {
            e.printStackTrace()
            defaultValue
        }
    }

    override suspend fun writeTo(
        t: AppPreferences,
        output: OutputStream
    ) {
        val jsonBytes = Json.Default.encodeToString(serializer = AppPreferences.serializer(), value = t)
            .encodeToByteArray()
        output.write(jsonBytes)
    }
}
