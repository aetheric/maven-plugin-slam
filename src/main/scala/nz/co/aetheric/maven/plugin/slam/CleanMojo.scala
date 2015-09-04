package nz.co.aetheric.maven.plugin.slam

import org.apache.maven.plugin.AbstractMojo
import org.apache.maven.plugins.annotations.Mojo
import sun.reflect.generics.reflectiveObjects.NotImplementedException

/**
 * Goes through all git branches and removes everything that's safely integrated.
 */
@Mojo(name = "clean")
class CleanMojo extends AbstractMojo {

	@Override
	def execute() = {
		throw new NotImplementedException()
	}

}