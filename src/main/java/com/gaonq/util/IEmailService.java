package com.gaonq.util;

/**
 * Created by gaonq on 2018/1/17.
 */
public interface  IEmailService {
    /**
     * 发送简单邮件
     * @param sendTo 收件人地址
     * @param titel  邮件标题
     * @param content 邮件内容
     */
    public void sendSimpleMail(String sendTo, String titel, String content);
//
//    /**
//     * 发送简单邮件
//     * @param sendTo 收件人地址
//     * @param titel  邮件标题
//     * @param content 邮件内容
//     * @param attachments<文件名，附件> 附件列表
//     */
//    public void sendAttachmentsMail(String sendTo, String titel, String content, List<Pair<String, File>> attachments);
//
//    /**
//     * 发送模板邮件
//     * @param sendTo 收件人地址
//     * @param titel  邮件标题
//     * @param content<key, 内容> 邮件内容
//     * @param attachments<文件名，附件> 附件列表
//     */
//    public void sendTemplateMail(String sendTo, String titel, Map<String, Object> content, List<Pair<String, File>> attachments);
}
