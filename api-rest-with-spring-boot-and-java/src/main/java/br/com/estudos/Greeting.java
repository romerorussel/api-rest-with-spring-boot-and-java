package br.com.estudos;

import java.util.Objects;

public class Greeting {

    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Greeting greeting)) return false;
        return getId() == greeting.getId() && Objects.equals(getContent(), greeting.getContent());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getContent());
    }


}
