import java.util.ArrayList;
import java.util.List;

/**
 * @author Albert Ku
 * @date 2020/6/9
 * @leetCode 面试题17.12
 * @title 二叉树数据结构TreeNode可用来表示单向链表（其中left置空，right为下一个链表节点）。实现一个方法，把二叉搜索树转换为单向链表，要求值的顺序保持不变，转换操作应是原址的，也就是在原始的二叉搜索树上直接修改。
 *
 * 返回转换后的单向链表的头节点。
 *
 * 注意：本题相对原题稍作改动
 *
 *  
 *
 * 示例：
 *
 * 输入： [4,2,5,1,3,null,6,0]
 * 输出： [0,null,1,null,2,null,3,null,4,null,5,null,6]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/binode-lcci
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @timeComplexity
 * @spaceComplexity
 */


public class ConvertBiNode {


    public TreeNode solution(TreeNode root) {
        //recursion
//        TreeNode head = new TreeNode(0);// 单链表的头指针哨兵
        // 开始中序遍历
//        inorder(root,head);
//        return head.right;
        //转集合方式
        if(root == null)
        return null;
        List<TreeNode> nodes = new ArrayList<>();
        inorder(nodes,root);//中序遍历将节点添加到集合
        return assemble(nodes);
    }

    //中序遍历存入集合
    public void inorder(List<TreeNode> nodes, TreeNode root){
        if(root == null)
            return;
        inorder(nodes,root.left);
        nodes.add(root);
        inorder(nodes,root.right);
    }
    //遍历集合进行节点指向
    public TreeNode assemble(List<TreeNode> nodes){
        for(int i=0;i<nodes.size()-1;i++){
            nodes.get(i).left = null;//将各节点left置空
            nodes.get(i).right = nodes.get(i+1);//将各节点right指向下一个节点
        }
        // 将最后一个结点处理干净
        nodes.get(nodes.size()-1).left = null;
        nodes.get(nodes.size()-1).right = null;
        return nodes.get(0);
    }

    //recursion
    private TreeNode inorder(TreeNode root,TreeNode prev){
        if (root != null){
            prev = inorder(root.left,prev);
            root.left = null;
            prev.right = root;
            prev = root;
            prev = inorder(root.right,prev);
        }
        return prev;
    }
}