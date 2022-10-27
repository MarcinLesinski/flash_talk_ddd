import io.kotest.assertions.throwables.shouldNotThrow
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

internal class ContractIdTest {

    @Test
    fun `Throw when contract name is invalid`() {
        val createInvalidContract = { ContractId(INVALID_NAME) }

        shouldThrow<IllegalArgumentException>(createInvalidContract)
    }

    @Test
    fun `Don't throw when contract name is valid`() {
        val createValidContract = { ContractId(VALID_NAME) }

        shouldNotThrow<IllegalArgumentException>(createValidContract)
    }

    @Test
    fun `Return short name`() {
        val shortName = ContractId("UM/ABCD").shortName

        shortName shouldBe "ABCD"
    }

    companion object {
        private const val VALID_NAME = "UM/ABCD"
        private const val INVALID_NAME = "ABCD"
    }
}
