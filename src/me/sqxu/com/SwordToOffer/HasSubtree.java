package me.sqxu.com.SwordToOffer;

import me.sqxu.com.SwordToOffer.util.TreeNode;

/**
 * 树的子结构
 *
 * @author : Administrator
 * @create 2018-04-10 13:16
 * @subject 输入两棵二叉树A，B，判断B是不是A的子结构（ps：我们约定空树不是任意一个树的子结构)，树的子结构
 */
public class HasSubtree {

    /**
     * 分两步，第一步在树A中查找与该根节点一样的值的节点R，第二步再来判断树A之中，以R为根节点的子树是否包含和根节点一样的结构
     *
     * @param root1
     * @param root2
     * @return boolean
     */

    public boolean HasSubtreeInBinaryTree(TreeNode root1, TreeNode root2){
        boolean result = false;
        if(root1 == null && root2 == null) {

            if (root1.val == root2.val) {
                return DoseHaveSubtree(root1, root2);
                //若根节点相同，则继续判断两个树的子树是否相同
                //若根节点相同，则继续判断两个树的子树是否相同
            }
            if (!result) {
                return HasSubtreeInBinaryTree(root1.left, root2);
                //判断root1左子树，与root2是否相同，若不相同，return false,
                //那么！result =true,那么将继续递归root1的左子树，直到找到相同的根节点
            }
            if (!result) {
                return HasSubtreeInBinaryTree(root1.right, root2);
            }
        }
        return result;
    }

    private boolean DoseHaveSubtree(TreeNode root1, TreeNode root2){
        if(root2 == null){
            return true;     //如果root2先遍历完了，说明找到对应的子树
        }
        if(root1 == null){
            return false;   //如果root1先遍历完了，说明还没有找到对应的子树
        }
        if(root1.val != root2.val){
            return false;
        }

        return DoseHaveSubtree(root1.left,root2) && DoseHaveSubtree(root1.right,root2);
    }
}
