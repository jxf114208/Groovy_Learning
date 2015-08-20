/**
 *  使用记忆化改进性能
 *  
 *  memoize()
 */
package ch4.UsingClosures

import groovy.transform.Immutable;

def timeIt(length, closure) {
	start = System.nanoTime()
	println "Max revenue for $length is ${closure(length)}"
	end = System.nanoTime()
	println "Time taken ${(end - start)/1.0e9} second"
}


def rodPrices = [0,1,3,4,5,,8,9,11,12,14,15,15,16,18,19,15,20,21,22,24,25,24,26,28,29,35,37,38,39,40]
def desiredLength = 27

@Immutable
class RevenueDatails {
	int revenue
	ArrayList splits
}

def cutRod(prices, length){
	if (length == 0) {
		new RevenueDatails(0, [])
	} else {
		def maxRevenueDetails = new RevenueDatails(Integer.MIN_VALUE, [])
		for (rodSize in 1..length) {
			def revenueFromSecondHalf = cutRod(prices, length - rodSize)
			def potentialRevenue = new RevenueDatails(prices[rodSize] + revenueFromSecondHalf.revenue, revenueFromSecondHalf.splits + rodSize)
			if (potentialRevenue.revenue > maxRevenueDetails.revenue) {
				maxRevenueDetails = potentialRevenue
			}
		}
		maxRevenueDetails
	}
}

//转化为闭包，然后在闭包上调用memoize()方法：
def cutRod1
cutRod1 = {prices, length ->
	if (length == 0) {
		new RevenueDatails(0, [])
	} else {
		def maxRevenueDetails = new RevenueDatails(Integer.MIN_VALUE, [])
		for (rodSize in 1..length) {
			def revenueFromSecondHalf = cutRod(prices, length - rodSize)
			def potentialRevenue = new RevenueDatails(prices[rodSize] + revenueFromSecondHalf.revenue, revenueFromSecondHalf.splits + rodSize)
			if (potentialRevenue.revenue > maxRevenueDetails.revenue) {
				maxRevenueDetails = potentialRevenue
			}
		}
		maxRevenueDetails
	}
}.memoize()


timeIt(desiredLength, {length -> 
	cutRod1(rodPrices, length)
})