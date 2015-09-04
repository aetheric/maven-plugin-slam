package nz.co.aetheric.maven.plugin.slam

import org.apache.maven.plugin.AbstractMojo
import org.apache.maven.plugins.annotations.{Mojo, Parameter}

/**
 * Will create a new feature branch based off an issue tracker.
 */
@Mojo(name = "start")
class StartMojoTest extends AbstractMojo {

	/**
	 * Reference will resolve to a branch or commit. Specifying a tag will trigger a patch operation first.
	 */
	@Parameter(required = false)
	var sourceRef: String = _

	/**
	 * The issue tracker
	 */
	@Parameter(required = true)
	var issueKey: String = _

	@Parameter(required = false, defaultValue = null)
	var trackerUrl: String = _

	@Override
	def execute() = {
		//
	}

}