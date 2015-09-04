package nz.co.aetheric.maven.plugin.slam

import org.scalatest._
import sun.reflect.generics.reflectiveObjects.NotImplementedException

/**
 * Tests for [[nz.co.aetheric.maven.plugin.slam.StartMojo]].
 */
class StartMojoTest extends SlamMojoTestBase[StartMojo] {

	override val target = "start"

	"The Mojo" should "fail immediately when executed" in {
		a [NotImplementedException] should be thrownBy mojo.execute()
	}

}