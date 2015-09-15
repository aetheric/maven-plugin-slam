package nz.co.aetheric.maven.plugin.slam

import java.io.File

import org.apache.maven.plugin.testing.MojoRule
import org.apache.maven.plugin.testing.resources.TestResources
import org.junit.{Before, Rule}
import org.scalatest.{BeforeAndAfter, Matchers}
import org.scalatest.junit.{AssertionsForJUnit, JUnitSuite}

/**
 * Base class for all slam [[org.apache.maven.plugin.AbstractMojo]] tests.
 */
abstract class SlamMojoTestBase[MojoType] extends JUnitSuite
		with Matchers
		with AssertionsForJUnit {

	val _rule = new MojoRule()

	@Rule
	def rule = _rule

	val _resources = new TestResources()

	@Rule
	def resources = _resources

	val target : String

	var mojo : MojoType = null.asInstanceOf[MojoType]

	@Before
	def setUp(): Unit = {

		// find the test pom.
		val testPom = new File(resources.getBasedir("project"), "pom.xml")
		assume(testPom != null && testPom.exists(), "Couldn't find the test pom.")

		// Configure the needed mojo
		mojo = rule.lookupMojo(target, testPom).asInstanceOf[MojoType]
		assume(mojo != null, "Couldn't configure the mojo.")

	}

}
