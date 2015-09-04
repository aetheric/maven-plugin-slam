package nz.co.aetheric.maven.plugin.slam

import org.scalatest._
import sun.reflect.generics.reflectiveObjects.NotImplementedException

/**
 * Tests for [[nz.co.aetheric.maven.plugin.slam.CutMojo]].
 */
class CutMojoTest extends SlamMojoTestBase[CutMojo] {

	override val target = "cut"

	"The Mojo" should "fail immediately when executed" in {
		a [NotImplementedException] should be thrownBy mojo.execute()
	}

}