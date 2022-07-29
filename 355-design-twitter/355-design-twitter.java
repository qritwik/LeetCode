class Twitter {
    int timestamp;
    Map<Integer, List<Pair>> userTweetMap;
    Map<Integer, Set<Integer>> followerFolloweeMap;

    public Twitter() {
        timestamp = 0;
        userTweetMap = new HashMap<>();
        followerFolloweeMap = new HashMap<>();
    }

    public void postTweet(int userId, int tweetId) {
        Pair userTweetPair = new Pair(tweetId, timestamp++);
        if (!userTweetMap.containsKey(userId)) {
            List<Pair> list = new ArrayList<>();
            list.add(userTweetPair);
            userTweetMap.put(userId, list);
        } else {
            List<Pair> list1 = userTweetMap.get(userId);
            list1.add(userTweetPair);
            userTweetMap.put(userId, list1);
        }
    }

    public List<Integer> getNewsFeed(int userId) {
        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (pair1, pair2) -> {
                return pair2.time_stamp - pair1.time_stamp;
            }
        );

        if (userTweetMap.containsKey(userId)) {
            List<Pair> userPairList = userTweetMap.get(userId);
            for (Pair p : userPairList) {
                pq.add(p);
            }
        }

        if (followerFolloweeMap.containsKey(userId)) {
            Set<Integer> userFolloweeSet = followerFolloweeMap.get(userId);
            for (int user : userFolloweeSet) {
                if(userTweetMap.containsKey(user)) {
                    List<Pair> userFolloweePairList = userTweetMap.get(user);
                    for (Pair p1 : userFolloweePairList) {
                        pq.add(p1);
                    }
                }
            }
        }

        List<Integer> result = new ArrayList<>();
        int i = 0;
        while (pq.size() > 0 && i < 10) {
            Pair p2 = pq.poll();
            result.add(p2.tweet_Id);
            i++;
        }
        return result;
    }

    public void follow(int followerId, int followeeId) {
        if (!followerFolloweeMap.containsKey(followerId)) {
            Set<Integer> set = new HashSet<>();
            set.add(followeeId);
            followerFolloweeMap.put(followerId, set);
        } else {
            Set<Integer> set = followerFolloweeMap.get(followerId);
            set.add(followeeId);
            followerFolloweeMap.put(followerId, set);
        }
    }

    public void unfollow(int followerId, int followeeId) {
        if(followerFolloweeMap.containsKey(followerId)) {
            Set<Integer> set = followerFolloweeMap.get(followerId);
            if(set.contains(followeeId)) set.remove(followeeId);
            followerFolloweeMap.put(followerId, set);
        } 
    }
}

class Pair {
    int tweet_Id;
    int time_stamp;

    public Pair(int tweet_Id, int time_stamp) {
        this.tweet_Id = tweet_Id;
        this.time_stamp = time_stamp;
    }
}
/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */
