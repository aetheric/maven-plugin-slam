package nz.co.aetheric.maven.plugin.slam

import sun.reflect.generics.reflectiveObjects.NotImplementedException

/**
 * Tests for [[nz.co.aetheric.maven.plugin.slam.ReleaseMojo]].
 */
class ReleaseMojoTest extends SlamMojoTestBase[ReleaseMojo] {

	override val target = "release"

	"The Mojo" should "fail immediately when executed" in {
		a [NotImplementedException] should be thrownBy mojo.execute()
	}

}