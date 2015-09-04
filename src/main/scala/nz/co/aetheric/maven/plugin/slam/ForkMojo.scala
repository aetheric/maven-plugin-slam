package nz.co.aetheric.maven.plugin.slam

import org.apache.maven.plugin.AbstractMojo
import org.apache.maven.plugins.annotations.{Mojo, Parameter}

@Mojo(name = "fork")
class ForkMojo extends AbstractMojo {

	@Parameter(required = true)
	var sourceTag: String = _

	@Parameter(required = true)
	var targetVersion: String = _

	@Override
	def execute() = {
		//
	}

}