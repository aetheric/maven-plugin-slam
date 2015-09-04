package nz.co.aetheric.maven.plugin.slam

import org.apache.maven.plugin.AbstractMojo
import org.apache.maven.plugins.annotations.{Mojo, Parameter}
import sun.reflect.generics.reflectiveObjects.NotImplementedException

/**
 * Will create a new feature branch based off an issue tracker.
 */
@Mojo(name = "start")
class StartMojo extends AbstractMojo {

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

	@Parameter(required = false)
	var trackerUrl: String = _

	@Override
	def execute() = {
		throw new NotImplementedException()
	}

}