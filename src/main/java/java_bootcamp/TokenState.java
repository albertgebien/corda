package java_bootcamp;

import net.corda.core.contracts.ContractState;
import net.corda.core.identity.AbstractParty;
import net.corda.core.identity.Party;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.List;

/* Our state, defining a shared fact on the ledger.
 * See src/main/java/examples/IAmAState.java and
 * src/main/java/examples/IAmAlsoAState.java for examples. */
public class TokenState implements ContractState{
    private Party issuer;
    private Party owner;
    private int amount;

    public TokenState(Party issuer, Party owner, int amount){
        this.issuer = issuer;
        this.owner = owner;
        this.amount = amount;
    }


    public Party getIssuer() {
        return issuer;
    }

    public void setIssuer(Party issuer) {
        this.issuer = issuer;
    }

    public Party getOwner() {
        return owner;
    }

    public void setOwner(Party owner) {
        this.owner = owner;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @NotNull
    @Override
    public List<AbstractParty> getParticipants() {
        return Arrays.asList(issuer, owner);
    }
}