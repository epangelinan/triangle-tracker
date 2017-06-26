class Triangle {
  public int mSide1;
  public int mSide2;
  public int mSide3;

  public String determineTriangle(int side1, int side2, int side3) {
    if ((side1 == side2) && (side2 == side3)) {
      return "The triangle is Equilateral";
  }
  }

}
