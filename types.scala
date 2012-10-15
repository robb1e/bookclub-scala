trait Cache[K, V] {
  def put(key: K, value: V)
}

class StringCache extends Cache[String, String] {
  def put(key: String, value: String) {
  }
}

var cache = new StringCache

cache.put("foo", "bar")


