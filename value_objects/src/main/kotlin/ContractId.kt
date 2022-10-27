internal class ContractId(
    name: String,
) {
    init {
        require(name.startsWith("UM/")) {
            "Valid contract should starts with 'UM/'"
        }
    }

    val shortName = name.substring(3)
}
