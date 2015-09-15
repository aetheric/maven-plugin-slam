package nz.co.aetheric.maven.plugin.slam

import org.junit.Test
import org.scalatest._
import sun.reflect.generics.reflectiveObjects.NotImplementedException

/**
 * Tests for [[nz.co.aetheric.maven.plugin.slam.ForkMojo]].
 */
class ForkMojoTest extends SlamMojoTestBase[ForkMojo] {

	override val target = "fork"

	@Test
	def theMojoShouldFailImmediatelyWhenExecuted() {
		a [NotImplementedException] should be thrownBy mojo.execute()
	}

}
