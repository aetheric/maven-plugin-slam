package nz.co.aetheric.maven.plugin.slam

import org.apache.maven.plugin.AbstractMojo
import org.apache.maven.plugins.annotations.{Mojo, Parameter}

@Mojo(name = "cut")
class CutMojo extends AbstractMojo {

	@Parameter(required = false)
	var nextRelease: String = _

	@Parameter(required = false, defaultValue = "false")
	var majorRelease: Boolean = _

	@Parameter(required = false, defaultValue = "")
	var branchPrefix: String = _

	@Override
	def execute() = {
		//
	}

}