package nz.co.aetheric.maven.plugin.slam

import org.junit.Test
import sun.reflect.generics.reflectiveObjects.NotImplementedException

/**
 * Tests for [[nz.co.aetheric.maven.plugin.slam.ReleaseMojo]].
 */
class ReleaseMojoTest extends SlamMojoTestBase[ReleaseMojo] {

	override val target = "release"

	@Test
	def theMojoShouldFailImmediatelyWhenExecuted() {
		a [NotImplementedException] should be thrownBy mojo.execute()
	}

}
