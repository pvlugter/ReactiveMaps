addSbtPlugin("com.typesafe.rp" % "sbt-typesafe-rp" % "15v09p01-instrumented-02")

val typesafeUrl = "https://repo.typesafe.com/typesafe/subscribers-early-access"

resolvers += "typesafe-rp-mvn" at typesafeUrl

resolvers += Resolver.url("typesafe-rp-ivy", url(typesafeUrl))(Resolver.ivyStylePatterns)

resolvers += Resolver.typesafeRepo("releases")
