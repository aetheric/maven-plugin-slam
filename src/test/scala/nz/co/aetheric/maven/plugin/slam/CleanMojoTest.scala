package nz.co.aetheric.maven.plugin.slam

import org.junit.Test
import sun.reflect.generics.reflectiveObjects.NotImplementedException

/**
 * Tests for [[nz.co.aetheric.maven.plugin.slam.CleanMojo]].
 */
class CleanMojoTest extends SlamMojoTestBase[CleanMojo] {

	override val target = "clean"

	@Test
	def theMojoShouldFailImmediatelyWhenExecuted() {
		a [NotImplementedException] should be thrownBy mojo.execute()
	}

}
