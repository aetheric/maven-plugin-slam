package nz.co.aetheric.maven.plugin.slam

import org.junit.Test
import sun.reflect.generics.reflectiveObjects.NotImplementedException

/**
 * Tests for [[nz.co.aetheric.maven.plugin.slam.PatchMojo]].
 */
class PatchMojoTest extends SlamMojoTestBase[PatchMojo] {

	override val target = "patch"

	@Test
	def theMojoShouldFailImmediatelyWhenExecuted() {
		a [NotImplementedException] should be thrownBy mojo.execute()
	}

}
