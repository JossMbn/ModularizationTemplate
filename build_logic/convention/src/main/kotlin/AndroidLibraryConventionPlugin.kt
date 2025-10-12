import com.android.build.api.dsl.LibraryExtension
import com.jmabilon.modularizationtemplate.configureAndroid
import com.jmabilon.modularizationtemplate.implementation
import com.jmabilon.modularizationtemplate.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.apply
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.dependencies

class AndroidLibraryConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) = with(target) {
        apply(plugin = libs.findPlugin("android.library").get().get().pluginId)
        apply(plugin = libs.findPlugin("kotlin.android").get().get().pluginId)

        extensions.configure<LibraryExtension> {
            configureAndroid(commonExtension = this)
        }

        dependencies {
            implementation(libs.findLibrary("koin-android").get())
        }
    }
}
