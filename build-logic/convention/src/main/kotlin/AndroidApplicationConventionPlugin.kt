import com.android.build.api.dsl.ApplicationExtension
import com.jmabilon.modularizationtemplate.configureAndroid
import com.jmabilon.modularizationtemplate.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.apply
import org.gradle.kotlin.dsl.configure

class AndroidApplicationConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) = with(target) {
        with(target) {
            apply(plugin = libs.findPlugin("android.application").get().get().pluginId)
            apply(plugin = libs.findPlugin("kotlin.android").get().get().pluginId)

            extensions.configure<ApplicationExtension> {
                configureAndroid(commonExtension = this)
                defaultConfig.targetSdk = 36
            }
        }
    }
}
