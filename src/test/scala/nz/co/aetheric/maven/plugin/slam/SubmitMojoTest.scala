package nz.co.aetheric.maven.plugin.slam

import org.junit.Test
import org.scalatest._
import sun.reflect.generics.reflectiveObjects.NotImplementedException

/**
 * Tests for [[nz.co.aetheric.maven.plugin.slam.SubmitMojo]].
 */
class SubmitMojoTest extends SlamMojoTestBase[SubmitMojo] {

	override val target = "submit"

	@Test
	def theMojoShouldFailImmediatelyWhenExecuted() {
		a [NotImplementedException] should be thrownBy mojo.execute()
	}

}
