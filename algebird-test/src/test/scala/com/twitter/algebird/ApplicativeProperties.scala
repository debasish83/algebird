/*
Copyright 2014 Twitter, Inc.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package com.twitter.algebird

import org.scalacheck.Properties

object ApplicativeProperties extends Properties("Applicative") {
  import ApplicativeLaws._
  import Monad._ // for Monad instances
  import MonadLaws._ // for Arbitrary instances

  property("list") = applicativeLaws[List, Int, String, Long]()
  property("option") = applicativeLaws[Option, Int, String, Long]()
  property("indexedseq") = applicativeLaws[IndexedSeq, Int, String, Long]()
  property("vector") = applicativeLaws[Vector, Int, String, Long]()
  property("set") = applicativeLaws[Set, Int, String, Long]()
  property("seq") = applicativeLaws[Seq, Int, String, Long]()
}
