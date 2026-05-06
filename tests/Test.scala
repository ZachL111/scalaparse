object TestRunner {
  def main(args: Array[String]): Unit = {
    val signalcase_1 = Signal(56, 89, 14, 20, 7)
    assert(Policy.score(signalcase_1) == 74)
    assert(Policy.classify(signalcase_1) == "review")
    val signalcase_2 = Signal(59, 81, 15, 20, 12)
    assert(Policy.score(signalcase_2) == 94)
    assert(Policy.classify(signalcase_2) == "review")
    val signalcase_3 = Signal(103, 87, 13, 6, 10)
    assert(Policy.score(signalcase_3) == 268)
    assert(Policy.classify(signalcase_3) == "accept")
    val domainReview = DomainReview(71, 31, 23, 80)
    assert(DomainReviewLens.score(domainReview) == 184)
    assert(DomainReviewLens.lane(domainReview) == "ship")
  }
}
