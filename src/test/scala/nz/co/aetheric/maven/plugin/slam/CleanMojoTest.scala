package nz.co.aetheric.maven.plugin.slam

import sun.reflect.generics.reflectiveObjects.NotImplementedException

/**
 * Tests for [[nz.co.aetheric.maven.plugin.slam.CleanMojo]].
 */
class CleanMojoTest extends SlamMojoTestBase[CleanMojo] {

	override val target = "clean"

	"The Mojo" should "fail immediately when executed" in {
		a [NotImplementedException] should be thrownBy mojo.execute()
	}

}