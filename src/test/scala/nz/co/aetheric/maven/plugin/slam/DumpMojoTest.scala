package nz.co.aetheric.maven.plugin.slam

import org.scalatest._
import sun.reflect.generics.reflectiveObjects.NotImplementedException

/**
 * Tests for [[nz.co.aetheric.maven.plugin.slam.DumpMojo]].
 */
class DumpMojoTest extends SlamMojoTestBase[DumpMojo] {

	override val target = "dump"

	"The Mojo" should "fail immediately when executed" in {
		a [NotImplementedException] should be thrownBy mojo.execute()
	}

}