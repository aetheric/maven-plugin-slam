package nz.co.aetheric.maven.plugin.slam

import org.apache.maven.plugin.AbstractMojo
import org.apache.maven.plugins.annotations.Mojo

/**
 * Goes through all git branches and removes everything that's safely integrated.
 */
@Mojo(name = "clean")
class CleanMojoTest extends AbstractMojo {

	@Override
	def execute() = {
		//
	}

}