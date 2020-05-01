/*
 Hanoi.java
 From Classic Computer Science Problems in Java Chapter 1
 Copyright 2020 David Kopec

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

package classic.computer.science.problems.chapter1;

import java.util.ArrayDeque;
import java.util.Deque;

public class Hanoi {
	private final int numDiscs;
	public final Deque<Integer> towerA = new ArrayDeque<>();
	public final Deque<Integer> towerB = new ArrayDeque<>();
	public final Deque<Integer> towerC = new ArrayDeque<>();

	public Hanoi(int numDiscs) {
		this.numDiscs = numDiscs;
		for (int i = 1; i <= numDiscs; i++) {
			towerA.addLast(i);
		}
	}

	private void move(Deque<Integer> begin, Deque<Integer> end, Deque<Integer> temp, int n) {

//        System.out.println("");
//        System.out.println("the beginning tower " + begin);
//        System.out.println("the ending tower " + end);
//        System.out.println("the temp tower " + temp);
//        System.out.println("");

		if (n == 1) {
			end.push(begin.pop());
		} else {
			move(begin, temp, end, n - 1);
			move(begin, end, temp, 1);
			move(temp, end, begin, n - 1);
		}
	}

	public void solve() {
		move(towerA, towerC, towerB, numDiscs);
	}

	public static void main(String[] args) {
		Hanoi hanoi = new Hanoi(20);

        System.out.println(hanoi.towerA);
        System.out.println(hanoi.towerB);
        System.out.println(hanoi.towerC);

		hanoi.solve();

		System.out.println(hanoi.towerA);
		System.out.println(hanoi.towerB);
		System.out.println(hanoi.towerC);
	}
}
