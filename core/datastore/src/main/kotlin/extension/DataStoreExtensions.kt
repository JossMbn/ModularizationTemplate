package extension

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.core.DataStoreFactory
import androidx.datastore.core.Serializer
import androidx.datastore.dataStoreFile

/**
 * Creates a DataStore instance with the given file name and serializer.
 */
fun <T> Context.createDataStore(
    fileName: String,
    serializer: Serializer<T>
): DataStore<T> = DataStoreFactory.create(
    serializer = serializer,
    produceFile = { dataStoreFile(fileName) }
)

/**
 * Updates the data in the DataStore safely by catching exceptions.
 */
suspend fun <T> DataStore<T>.safeUpdateData(
    transform: suspend (t: T) -> T
) {
    try {
        this.updateData { currentData ->
            transform(currentData)
        }
    } catch (_: Exception) {
        // Handle the exception (e.g., log it)
    }
}
