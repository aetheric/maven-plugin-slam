package nz.co.aetheric.maven.plugin.slam

import org.scalatest._
import sun.reflect.generics.reflectiveObjects.NotImplementedException

/**
 * Tests for [[nz.co.aetheric.maven.plugin.slam.SubmitMojo]].
 */
class SubmitMojoTest extends SlamMojoTestBase[SubmitMojo] {

	override val target = "submit"

	"The Mojo" should "fail immediately when executed" in {
		a [NotImplementedException] should be thrownBy mojo.execute()
	}

}