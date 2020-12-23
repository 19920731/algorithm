package algorithm.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DFSandBFS {

	public static boolean[] visited;
	public static ArrayList<ArrayList<Integer>> graph;

	public static void dfs(int x) {
		System.out.println("=============== DFS ===============");
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(x);
		visited[x] = true;

		while (!stack.empty()) {
			int tmp = stack.pop();
			System.out.print(tmp + " ");
			for (int i = 0; i < graph.get(tmp).size(); i++) {
				if (!visited[graph.get(tmp).get(i)]) {
					visited[graph.get(tmp).get(i)] = true;
					stack.push(graph.get(tmp).get(i));
				}
			}
		}
		System.out.println();
	}

	public static void bfs(int x) {
		System.out.println("=============== BFS ===============");
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(x);
		visited[x] = true;

		while (!queue.isEmpty()) {
			int tmp = queue.poll();
			System.out.print(tmp + " ");
			for (int i = 0; i < graph.get(tmp).size(); i++) {
				if (!visited[graph.get(tmp).get(i)]) {
					visited[graph.get(tmp).get(i)] = true;
					queue.add(graph.get(tmp).get(i));
				}
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		/*
		 *    -----------------
		 *          Graph
		 *    -----------------
		 *    
		 *            1
		 *          /   \
		 *         2     3
		 *       / |     | \
		 *      4  5     6  7
		 *     /|  |     |  |\
 		 *    8 9  10   11 12 13
 		 *    |                |
 		 *    14               15
		 */

		/* DFS */
		// 그래프 초기화
		visited = new boolean[16];
		graph = new ArrayList<ArrayList<Integer>>();

		for (int i = 0; i < 16; i++) {
			graph.add(new ArrayList<Integer>());
		}

		// 인접 노드 저장
		graph.get(1).add(2);
		graph.get(1).add(3);
		graph.get(2).add(4);
		graph.get(2).add(5);
		graph.get(3).add(6);
		graph.get(3).add(7);		
		graph.get(4).add(8);
		graph.get(4).add(9);
		graph.get(5).add(10);
		graph.get(6).add(11);
		graph.get(7).add(12);
		graph.get(7).add(13);
		graph.get(8).add(14);
		graph.get(13).add(15);		

		dfs(1);

		/* BFS */
		visited = new boolean[16];
		graph = new ArrayList<ArrayList<Integer>>();

		for (int i = 0; i < 16; i++) {
			graph.add(new ArrayList<Integer>());
		}

		// 인접 노드 저장
		graph.get(1).add(2);
		graph.get(1).add(3);
		graph.get(2).add(4);
		graph.get(2).add(5);
		graph.get(3).add(6);
		graph.get(3).add(7);		
		graph.get(4).add(8);
		graph.get(4).add(9);
		graph.get(5).add(10);
		graph.get(6).add(11);
		graph.get(7).add(12);
		graph.get(7).add(13);
		graph.get(8).add(14);
		graph.get(13).add(15);	

		bfs(1);
	}

}
