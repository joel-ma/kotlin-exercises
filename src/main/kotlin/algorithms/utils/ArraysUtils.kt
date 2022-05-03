package algorithms.utils

class ArraysUtils {

    fun rotateFrom(array: IntArray, startIndex: Int): IntArray {
        require(startIndex >= 0 && startIndex < array.size)

        return array.mapIndexed { index, _ ->
            array[(index + startIndex) % array.size]
        }.toIntArray()
    }

    fun findKthLargest(array: IntArray, k: Int): Int = array.sortedDescending()[k - 1]

    fun cloneMatrix(matrix: Array<IntArray>): Array<IntArray> = Array(matrix.size) {
            row -> IntArray(matrix[row].size) { col -> matrix[row][col] }
    }

    /**
     * Sets to 0 the entire row and column of every cell that has 0
     * input  [[1,1,1,1],
     *         [1,1,1,0],
     *         [1,1,1,1]]
     *
     * output [[1,1,1,0],
     *         [0,0,0,0],
     *         [1,1,1,0]]
     */
    fun setRowAndColToZeroInMatrix(matrix: Array<IntArray>): Array<IntArray> {
        val result = cloneMatrix(matrix)

        for (row in matrix.indices) {
            for(col in matrix[row].indices) {
                if (matrix[row][col] == 0) {
                    fillRowAndColumnWithZero(result, row, col)
                }
            }
        }

        return result
    }

    private fun fillRowAndColumnWithZero(matrix: Array<IntArray>, rowIndex: Int, colIndex: Int) {
        for(i in matrix[rowIndex].indices)
            matrix[rowIndex][i] = 0
        for(row in matrix)
            row[colIndex] = 0
    }
}