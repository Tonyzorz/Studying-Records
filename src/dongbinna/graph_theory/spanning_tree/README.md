연결 안된 노드 or cycle이 발생하면 신장 트리가 아니다 

최소 신장 트리 = 크루스칼 알고리즘 
그리디 알고리즘 


1. 간선 데이터를 비용에 따라 오름차순으로 정렬 
2. 간선을 하나씩 확인하며 현재의 간선이 사이클을 발생시키는지 확인 
 - 사이클 없음 = 최소 신장 트리에 추가 
 - 사이클 있음 = 최소 신장에 포함 안함 
3. 모든 간선에 대하여 2번의 과정 반복 
