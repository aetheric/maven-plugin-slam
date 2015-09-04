package nz.co.aetheric.maven.plugin.slam

import org.apache.maven.plugin.AbstractMojo
import org.apache.maven.plugins.annotations.{Mojo, Parameter}

/**
 * Will take a series of commits and
 */
@Mojo(name = "port")
class PortMojo extends AbstractMojo {

	@Parameter(required = true)
	var issueKey: String = _

	@Parameter(required = false)
	var sourceRange: List[String] = _

	@Parameter(required = false)
	var targetBranch: String = _

	@Override
	def execute() = {
		//
	}

}