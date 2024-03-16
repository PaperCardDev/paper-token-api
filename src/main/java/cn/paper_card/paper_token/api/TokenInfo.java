package cn.paper_card.paper_token.api;

import java.util.UUID;

public record TokenInfo(
        UUID token,
        UUID playerId,
        long expires,

        String name
) {
}