package nz.co.aetheric.maven.plugin.slam

import org.junit.Test
import sun.reflect.generics.reflectiveObjects.NotImplementedException

/**
 * Tests for [[nz.co.aetheric.maven.plugin.slam.PortMojo]].
 */
class PortMojoTest extends SlamMojoTestBase[PortMojo] {

	override val target = "port"

	@Test
	def theMojoShouldFailImmediatelyWhenExecuted() {
		a [NotImplementedException] should be thrownBy mojo.execute()
	}

}
