import com.android.build.gradle.BaseExtension
import com.jmabilon.modularizationtemplate.configureCompose
import com.jmabilon.modularizationtemplate.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.apply
import org.gradle.kotlin.dsl.getByType

class AndroidComposeConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            apply(plugin = libs.findPlugin("kotlin.compose").get().get().pluginId)

            val extension = extensions.getByType<BaseExtension>()
            configureCompose(commonExtension = extension)
        }
    }
}
