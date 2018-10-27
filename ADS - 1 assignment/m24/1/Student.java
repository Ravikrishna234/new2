/**studenttable.**/
final class Student {
    /**.
     * variable.
     */
    private int rollno;
    /**.
     * variable.
     */
    private String name;
    /**.
     * variable.;
     */
    private Double marks;
    /**
     * @brief [brief description]
     * @details [long description]
     *
     * @param name1 value
     * @param marks1 value
     */
    Student(final String name1, final Double marks1) {
        //this.rollno =roll;
        this.name = name1;
        this.marks = marks1;
    }
    // public int getrollno() {
    //  return this.rollno;
    // }

    /**
     * @brief [brief description]
     * @details [long description]
     * Time complexity is O(1)
     * @return [description]
     */
    public String getname() {
        return this.name;
    }
    /**
     * @brief [brief description]
     * @details [long description]
     * Time complexity is O(1)
     * @return [description]
     */
    public Double getmarks1() {
        return this.marks;
    }
    /**
     * @brief [brief description]
     * @details [long description]
     * Time complexity is O(1)
     * @return [description]
     */
    public String toString() {
        return this.getname() + "==" + this.getmarks1();
    }

}
