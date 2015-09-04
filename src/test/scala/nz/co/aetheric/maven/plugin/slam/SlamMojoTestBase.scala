package nz.co.aetheric.maven.plugin.slam

import java.nio.file.Paths

import org.apache.maven.plugin.testing.MojoRule
import org.apache.maven.project.MavenProject
import org.junit.Rule
import org.junit.runners.JUnit4
import org.scalatest.{BeforeAndAfter, WrapWith, Matchers, FlatSpec}

/**
 * Base class for all slam [[org.apache.maven.plugin.AbstractMojo]] tests.
 */
abstract class SlamMojoTestBase[MojoType] extends FlatSpec
		with Matchers
		with BeforeAndAfter {

	val filePath = "src/test/resources/project/pom.xml"

	@Rule
	val rule = new DefaultMojoRule()

	val target : String

	var project : MavenProject = null
	var mojo : MojoType = null.asInstanceOf[MojoType]

	before {

		// find the test pom.
		val pomFile = Paths.get(filePath).toFile
		pomFile should not be null
		pomFile.exists() should be

		// Load the maven project.
		project = rule.readMavenProject(pomFile)
		project should not be null

		// Load the target Mojo
		mojo = rule.lookupConfiguredMojo(project, target).asInstanceOf[MojoType]
		mojo should not be null

	}

	class DefaultMojoRule extends MojoRule {

		override def before(): Unit = {
			super.before()
		}

		override def after(): Unit = {
			super.after()
		}

	}

}
