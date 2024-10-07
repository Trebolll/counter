static def countElements(list) {
    def elementCountMap = [:]
    list.each { element ->
        elementCountMap[element] = elementCountMap.getOrDefault(element, 0) + 1
    }
    return elementCountMap
}

def list = [1, 3, 4, 5, 1, 5, 4]
def result = countElements(list)
println result
