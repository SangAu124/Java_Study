class gg {
    val str = "1 45 98 85\n" +
            "2 92 87 58\n" +
            "3 24 45 65\n" +
            "4 87 85 78\n" +
            "5 18 52 45\n" +
            "6 23 12 75\n" +
            "7 68 78 96\n" +
            "8 98 45 86\n" +
            "9 92 45 52\n" +
            "10 54 78 87\n" +
            "11 78 45 48\n" +
            "12 52 12 15\n" +
            "13 18 32 68\n" +
            "14 56 12 12\n" +
            "15 87 52 54\n" +
            "16 56 89 65\n" +
            "17 18 87 85\n" +
            "18 98 95 75\n" +
            "19 88 77 95\n" +
            "20 45 28 78"

    val name="테이블명"

    fun main() {
        val ids = str.split("\n")
        val queries = mutableListOf<String>()

        ids.forEach {
            val vals = it.split(" ")
            val num = vals[0]

            for(i in 1..3) {
                val query = "UPDATE ${name}${i} SET grade=${vals[i]} WHERE class=${num}"
                queries.add(query)
            }
        }

        println(queries.joinToString(";"))
    }

    private fun <T> mutableListOf(): Any {

    }
}