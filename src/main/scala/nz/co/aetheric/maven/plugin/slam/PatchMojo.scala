package nz.co.aetheric.maven.plugin.slam

import org.apache.maven.plugin.AbstractMojo
import org.apache.maven.plugins.annotations.{Mojo, Parameter}

@Mojo(name = "patch")
class PatchMojo extends AbstractMojo {

	@Parameter(required = true)
	var sourceTag: String = _

	@Override
	def execute() = {
		//
	}

}