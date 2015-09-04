package nz.co.aetheric.maven.plugin.slam

import org.apache.maven.plugin.AbstractMojo
import org.apache.maven.plugins.annotations.Mojo

/**
 * Will submit the current feature branch to merge request tool for review.
 */
@Mojo(name = "submit")
class SubmitMojoTest extends AbstractMojo {

	@Override
	def execute() = {
		//
	}

}