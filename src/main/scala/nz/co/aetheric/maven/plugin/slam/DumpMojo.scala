package nz.co.aetheric.maven.plugin.slam

import org.apache.maven.plugin.AbstractMojo
import org.apache.maven.plugins.annotations.{Mojo, Parameter}
import sun.reflect.generics.reflectiveObjects.NotImplementedException

/**
 * Adds and commits all workspace changes in one messy go, interactively prompting for some explanation as to what was
 * done.
 */
@Mojo(name = "dump")
class DumpMojo extends AbstractMojo {

	/**
	 * The issue tracker key.
	 */
	@Parameter(required = true)
	var issueKey: String = _

	/** The issue tracker url; used for updating issues with progress. */
	@Parameter(required = false)
	var trackerUrl: String = _

	@Override
	def execute() = {
		throw new NotImplementedException()
	}

}