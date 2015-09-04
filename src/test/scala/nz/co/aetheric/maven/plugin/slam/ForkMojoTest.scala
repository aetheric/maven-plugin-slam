package nz.co.aetheric.maven.plugin.slam

import org.scalatest._
import sun.reflect.generics.reflectiveObjects.NotImplementedException

/**
 * Tests for [[nz.co.aetheric.maven.plugin.slam.ForkMojo]].
 */
class ForkMojoTest extends SlamMojoTestBase[ForkMojo] {

	override val target = "fork"

	"The Mojo" should "fail immediately when executed" in {
		a [NotImplementedException] should be thrownBy mojo.execute()
	}

}