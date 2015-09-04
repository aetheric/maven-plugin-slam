package nz.co.aetheric.maven.plugin.slam

import org.apache.maven.plugin.AbstractMojo
import org.apache.maven.plugins.annotations.{Mojo, Parameter}

/**
 * Will create a release tag, build it, and upload the results to a repository, then delete the branch and merge the
 * tag back into the originating branch.
 */
@Mojo(name = "release")
class ReleaseMojoTest extends AbstractMojo {

	@Parameter(required = false, defaultValue = "")
	var tagPrefix: String = _

	@Override
	def execute() = {
		//
	}

}