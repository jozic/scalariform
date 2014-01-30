package scalariform.formatter

import scalariform.formatter.preferences.{RewriteArrowSymbolsBack, FormattingPreferences}

class RewriteArrowsBackTest extends AbstractExpressionFormatterTest {

  {
    implicit val formattingPreferences = FormattingPreferences.setPreference(RewriteArrowSymbolsBack, true)

    "(a: Int) ⇒ 3" ==> "(a: Int) => 3"
    "for (i ← 1 to 10) yield i" ==> "for (i <- 1 to 10) yield i"
  }

  override val debug = false

}

