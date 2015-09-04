package nz.co.aetheric.maven.plugin.slam

import sun.reflect.generics.reflectiveObjects.NotImplementedException

/**
 * Tests for [[nz.co.aetheric.maven.plugin.slam.PatchMojo]].
 */
class PatchMojoTest extends SlamMojoTestBase[PatchMojo] {

	override val target = "patch"

	"The Mojo" should "fail immediately when executed" in {
		a [NotImplementedException] should be thrownBy mojo.execute()
	}

}