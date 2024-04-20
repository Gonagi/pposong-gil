package pposonggil.usedStuff.domain;

import jakarta.persistence.*;
import lombok.Getter;
import org.hibernate.annotations.DynamicInsert;

import java.time.LocalDate;

import static jakarta.persistence.FetchType.LAZY;

@Entity
@Getter
@DynamicInsert
public class TransactionInformation {
    @Id
    @GeneratedValue
    @Column(name = "transaction_information_id")
    private Long id;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "member_id")
    private Member transactionMember;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "chat_room_id")
    private ChatRoom transactionChatRoom;

    @Embedded
    private TransactionAddress address;

    private LocalDate created_at;

    public void setTransactionMember(Member member) {
        this.transactionMember = member;
        member.getTransactionInformations().add(this);
    }

    public void setTransactionChatRoom(ChatRoom chatRoom) {
        this.transactionChatRoom = chatRoom;
        chatRoom.getTransactionInformations().add(this);
    }
}
